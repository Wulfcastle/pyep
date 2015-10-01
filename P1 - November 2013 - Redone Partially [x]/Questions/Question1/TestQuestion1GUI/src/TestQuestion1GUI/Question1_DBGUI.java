package TestQuestion1GUI;

import java.sql.*;

public class Question1_DBGUI   {
  Connection conn;
  String message;  

  public String getMessage() {
      return message;
  }    

   public Question1_DBGUI ()
  {
  //load the driver
     try
     {
        Class.forName ("sun.jdbc.odbc.JdbcOdbcDriver");
        message = "Driver successfully loaded";
     }
         catch (ClassNotFoundException c)
        {
           message = "Unable to load database driver";
        }      
     //connect to the database
     try
     {   
        String filename = "Question1DB.mdb";
        String database = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
        database += filename.trim () + ";DriverID=22;READONLY=true}"; 
        conn = DriverManager.getConnection (database, "", "");
        message += "\n\nConnection with database successfully established";
     }
         catch (Exception e)
        {
           message += "\n\nUnable to connect with the database";
        }
  } //end connect

  public void display (String sql) throws SQLException
  {
      message = "\n";
     Statement stmt = conn.createStatement (); 
     ResultSet rs = stmt.executeQuery (sql);
     int rowCount = 0;

     while (rs.next())
     {
            rowCount++;
     }

     ResultSetMetaData rsm = rs.getMetaData();
     int colCount = rsm.getColumnCount();
     int numCount = 0;
     for (int i = 1; i <= colCount; i++)
     {
            rs = stmt.executeQuery (sql);
            rsm = rs.getMetaData();
            if (rsm.getColumnTypeName(i).contains("INT"))
        {
            numCount++;
        }
        else if (rsm.getColumnTypeName(i).contains("DOUBLE"))
        {
            numCount++;	
        }
        else if (rsm.getColumnTypeName(i).contains("CURRENCY"))
        {
            numCount++;	
        }
     }        

     String colNames[] = new String[colCount];
     String colTypes[] = new String[colCount];
     int colWidths[] = new int[colCount];
     String fStrings[] = new String[rowCount];
     String fStringHeadings = "";
     int totalLength = 0;

     for (int i = 1; i <= colCount; i++)
     {
            rs = stmt.executeQuery (sql);
            rsm = rs.getMetaData();
            colNames[i-1] = rsm.getColumnName(i);
            colTypes[i-1] = rsm.getColumnTypeName(i);
            String longestValue = colNames[i-1];
            while (rs.next ())
            {
                String fieldValue = rs.getString(i);
                if (fieldValue == null) 
                {
                  fieldValue = " ";     
                }
                if (colTypes[i-1].equals("BIT"))
                {
                    if (fieldValue.equals("0"))
                    {
                        fieldValue = "False";
                    }
                    else if (fieldValue.equals("1"))
                    {
                        fieldValue = "True";
                    }
                }	            
                else if (colTypes[i-1].equals("DATETIME"))
                {
                    fieldValue = fieldValue.substring(10);
                }
                if (colTypes[i-1].contains("CURRENCY") & fieldValue.length() > longestValue.length())
                {
                    longestValue = fieldValue.substring(2);
                }
                else if (fieldValue.length() > longestValue.length())
                {
                    longestValue = fieldValue;
                }
            }
            colWidths[i-1] = longestValue.length() + 3;       	
            rs.close();
     }
     int colNameCount = colCount + numCount;       	
     String newColNames[] = new String[colNameCount];
     int newColWidths[] = new int[colNameCount];
     int newColi = 1;       
     for (int i = 1; i <= colCount; i++)
     {
        newColNames[newColi-1] = colNames[i-1]; 
        newColWidths[newColi-1] = colWidths[i-1]; 
        newColi++;
        if (colTypes[i-1].contains("INT"))
        {
            fStringHeadings = fStringHeadings + "%-" + (colWidths[i-1] - 3) + "s%-3s";
            newColNames[newColi-1] = " ";
            newColWidths[newColi-1] = 3;
            newColi++;
        }
        else if (colTypes[i-1].contains("DOUBLE"))
        {
            fStringHeadings = fStringHeadings + "%-" + (colWidths[i-1] - 3) + "s%-3s";
            newColNames[newColi-1] = " ";
            newColWidths[newColi-1] = 3;
            newColi++;
        }
        else if (colTypes[i-1].contains("CURRENCY"))
        {
            fStringHeadings = fStringHeadings + "%-" + (colWidths[i-1] - 3) + "s%-3s";
            newColNames[newColi-1] = " ";
            newColWidths[newColi-1] = 3;
            newColi++;
        }
        else
        {
            fStringHeadings = fStringHeadings + "%-" + colWidths[i-1] + "s";        		
        }       
        totalLength = totalLength + colWidths[i-1];
     }
     rs = stmt.executeQuery (sql);
     message = String.format(fStringHeadings,(Object[]) newColNames);      
     message += "\n";            
     for (int i = 0; i < totalLength - 3; i++)
     {
        message += "=";
     }          	
     message += "\n";         
     int row = 0;         
     while (rs.next ())
     {
        Object[] record = new Object[colCount + numCount];
        fStrings[row] = "";
        int vali = 0;            
        for (int i = 1; i <= colCount; i++)
        {            	
            String fieldValue = rs.getString(i);
            if (colTypes[i-1].equals("BIT"))
                {
                    if (fieldValue.equals("0"))
                    {
                        fieldValue = "False";
                    }
                    else if (fieldValue.equals("1"))
                    {
                        fieldValue = "True";
                    }
                }	            
                else if (colTypes[i-1].equals("DATETIME"))
                {
                    fieldValue = fieldValue.substring(0, 11);
                }               	            	
            if (colTypes[i-1].contains("INT"))
                {
                    record[vali] = new Integer(fieldValue);
                    vali++;	            	
                    fStrings[row] = fStrings[row] + "%" + (colWidths[i-1] - 3) + "d%-3s";	            	
                    record[vali] = " ";
                    vali++;	            }
                else if (colTypes[i-1].contains("DOUBLE"))
                {	            
                    record[vali] =  new Double(fieldValue);
                    vali++;
                    fStrings[row] = fStrings[row] + "%" + (colWidths[i-1] - 3) + "." + (fieldValue.length() - fieldValue.indexOf(".") - 1) + "f%-3s";
                    record[vali] = " ";
                    vali++;	            		
                }
                else if (colTypes[i-1].contains("CURRENCY"))
                {	            
                    record[vali] = new Double(fieldValue);
                    vali++;
                    fStrings[row] = fStrings[row] + "%" + (colWidths[i-1] - 3) + ".2f%-3s";
                    record[vali] = " ";
                    vali++;	            		
                }
            else
            {
               if (fieldValue == null)
                {
                    record[vali] = " ";
                    }
                    else {
                        record[vali] = fieldValue;//text >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                }
                vali++;
                fStrings[row] = fStrings[row] + "%-" + colWidths[i-1] + "s";
            }           
        }        
        message += String.format(fStrings[row],record);        
        message += "\n";        
        row++;       
     }
     message += "\n";     
     rs.close();  
     stmt.close ();
  }

   public void delete(String sql)throws SQLException
  {
     Statement stmt = conn.createStatement (); 
     int rows = stmt.executeUpdate (sql);
     message = "\nRecords Processed Successfully";
     stmt.close ();
  }

  public void update(String sql)throws SQLException
  {
     Statement stmt = conn.createStatement (); 
     int rows = stmt.executeUpdate (sql);
     message = "\nRecords Processed Successfully";         
     stmt.close ();
  }

  public void insert(String sql)throws SQLException
  {
     Statement stmt = conn.createStatement (); 
     int rows = stmt.executeUpdate (sql);
     message = "\nRecords Processed Successfully";         
     stmt.close ();
  }

  public void query(String sql) throws SQLException
  {
    if (sql.toUpperCase().startsWith("INSERT"))
    {
        insert(sql);
    }
    else if (sql.toUpperCase().startsWith("DELETE"))
    {
        delete(sql);
    }
    else if (sql.toUpperCase().startsWith("UPDATE"))
    {
        update(sql);
    }
    else
    {
        display(sql);
    }
  }

  public void disconnect () throws SQLException
  {
     conn.close ();
  }
}


