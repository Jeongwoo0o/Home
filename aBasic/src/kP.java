

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class kP extends JFrame {

    JPanel contentpane;

    JTable tableBurger;
    JScrollPane scrollPane;

    BurgerTableModel tbModelBurger;

    public kP() {
        createTable();
        addBottomPanel();

        setBounds(500, 200, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void createTable() {
        tbModelBurger = new BurgerTableModel();

        tableBurger = new JTable(tbModelBurger);
        tableBurger.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        scrollPane = new JScrollPane(tableBurger);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    void addBottomPanel() {
        JButton addButton = new JButton("Add Item");
        JButton removeButton = new JButton("Remove Item");

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(addButton);
        bottomPanel.add(removeButton);

        getContentPane().add(bottomPanel, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 여기에 상품을 추가하는 코드를 넣어주세요.
                String newItem = JOptionPane.showInputDialog(kP.this, "Enter item name:");
                if (newItem != null && !newItem.isEmpty()) {
                    tbModelBurger.addItem(newItem);
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] selectedRows = tableBurger.getSelectedRows();
                tbModelBurger.removeItems(selectedRows);
            }
        });
    }

    class BurgerTableModel extends AbstractTableModel {
        ArrayList<Item> data = new ArrayList<>();
        String[] columnNames = {"상품", "수량"};

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.size();
        }

        public Object getValueAt(int row, int col) {
            if (col == 0) {
                return data.get(row).getName();
            } else if (col == 1) {
                return data.get(row).getQuantity();
            }
            return null;
        }

        public String getColumnName(int col) {
            return columnNames[col];
        }

        public void addItem(String itemName) {
            boolean found = false;
            for (Item item : data) {
                if (item.getName().equals(itemName)) {
                    item.incrementQuantity();
                    found = true;
                    break;
                }
            }
            if (!found) {
                data.add(new Item(itemName));
            }
            fireTableDataChanged();
        }

        public void removeItems(int[] rows) {
            for (int i = rows.length - 1; i >= 0; i--) {
                data.remove(rows[i]);
            }
            fireTableDataChanged();
        }
    }

    class Item {
        private String name;
        private int quantity;

        public Item(String name) {
            this.name = name;
            this.quantity = 1;
        }

        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void incrementQuantity() {
            quantity++;
        }
    }

    public static void main(String[] args) {
        new kP();
    }
}
