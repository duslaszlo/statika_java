/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package egyeb;

/**
 *
 * @author SD-LEAP
 */
// Imports
import javax.swing.*;
import javax.swing.table.*;

class CustomDataModel
			extends		AbstractTableModel  
{

	public Object getValueAt( int iRowIndex, int iColumnIndex )
	{
		return "" + iColumnIndex + "," + iRowIndex;
	}

	public void setValueAt( Object aValue, int iRowIndex, int iColumnIndex ) 
	{
		// All data is manufactured - nothing to do here
	}
	
	public int getColumnCount()
	{
		// Return 0 because we handle our own columns
		return 0;
	}	

	public int getRowCount()
	{
		return 13;
	}	
	
}