package Element;

import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class Table extends JTable {
    
    private static final long serialVersionUID = 1L;
    private JTable table;
       
    public Table() {           
        table = new JTable();
        table.setAutoCreateColumnsFromModel(true);
        table.isCellEditable(10, 10);
    }
    
    

    
}
