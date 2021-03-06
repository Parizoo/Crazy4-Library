package IHM;

import Library.Library;

import javax.swing.*;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicApplication extends JFrame {
    public GraphicApplication() {

        /*********************************************/
        /********* Configuration of JFrame ***********/
        /*********************************************/


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(350, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);


        /********************************************************/
        /************ Instantiation of our object ***************/
        /********************************************************/

        Library myLibrary = new Library();

        /***********************************************************/
        /***************** Configuration of JPanel *****************/
        /***********************************************************/

        JPanel paneStart = new JPanel();
        JPanel paneSearch = new JPanel();
        JPanel paneAddBook = new JPanel();
        JPanel paneResultTable = new JPanel();

        setContentPane(paneStart);
        paneStart.setBackground(Color.GREEN);
        paneSearch.setBackground(Color.ORANGE);
        paneAddBook.setBackground(Color.BLUE);
        paneResultTable.setBackground(Color.RED);


        /***********************************************************/
        /************** Configuration of Layout ********************/
        /***********************************************************/

        paneStart.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneSearch.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneResultTable.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneAddBook.setLayout(new FlowLayout(FlowLayout.LEFT));


        /***********************************************************/
        /********* Configuration Components of Panel ***************/
        /***********************************************************/

        //Panel Start
        JLabel MainTitle = new JLabel("Welcome to the Crazy4 Library");
        MainTitle.setPreferredSize(new Dimension(330, 300));
        MainTitle.setFont(new Font("Courier New ", Font.BOLD, 20));


        //Panel AddBook
        JLabel labelTitle = new JLabel();
        labelTitle.setText("Title : ");
        labelTitle.setForeground(Color.white);

        JTextField textTitle = new JTextField();
        textTitle.setColumns(29);

        JLabel labelAuthor = new JLabel();
        labelAuthor.setText("Author : ");
        labelAuthor.setForeground(Color.white);

        JTextField textAuthor = new JTextField();
        textAuthor.setColumns(29);

        JLabel labelYear = new JLabel();
        labelYear.setText("Year : ");
        labelYear.setForeground(Color.white);

        JTextField textYear = new JTextField();
        textYear.setColumns(29);

        JLabel labelEditor = new JLabel();
        labelEditor.setText("Editor : ");
        labelEditor.setForeground(Color.white);

        JTextField textEditor = new JTextField();
        textEditor.setColumns(29);

        JLabel labelLanguage = new JLabel();
        labelLanguage.setText("lang. : ");
        labelLanguage.setForeground(Color.white);

        JTextField textLanguage = new JTextField();
        textLanguage.setColumns(29);

        JLabel labelId = new JLabel();
        labelId.setText("Id: ");
        labelId.setForeground(Color.white);

        JTextField textId = new JTextField();
        textId.setColumns(29);

        JButton buttonValidate = new JButton();
        buttonValidate.setText("Validate");

        JLabel labelButtonRadio = new JLabel("Choose a category : ");
        labelButtonRadio.setForeground(Color.white);

        JRadioButton buttonTypeManga = new JRadioButton("Manga");
        buttonTypeManga.setActionCommand("Manga");
        buttonTypeManga.setForeground(Color.white);

        JRadioButton buttonNovel = new JRadioButton("Novel");
        buttonNovel.setActionCommand("Novel");
        buttonNovel.setForeground(Color.white);

        JRadioButton buttonMagazine = new JRadioButton("Magazine");
        buttonMagazine.setActionCommand("Magazine");
        buttonMagazine.setForeground(Color.white);

        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(buttonTypeManga);
        buttonGroup.add(buttonNovel);
        buttonGroup.add(buttonMagazine);

        JLabel labelConfirm = new JLabel();
        labelConfirm.setText("New book added in the library !");
        labelConfirm.setForeground(Color.white);
        labelConfirm.setFont(new Font("Courier New ", Font.BOLD, 15));

        JLabel labelFailure = new JLabel();
        labelFailure.setText("Please be focus !");
        labelFailure.setForeground(Color.white);
        labelFailure.setFont(new Font("Courier New ", Font.BOLD, 15));

        JComboBox chooseTypeManga = new JComboBox();
        chooseTypeManga.setVisible(false);

        JOptionPane.showMessageDialog(null, " WARNING - this content is reserved under 18");


        //Panel Search
        JButton getAllBooks = new JButton();
        getAllBooks.setText("Print all books");

        JButton getBooksStartByA = new JButton();
        getBooksStartByA.setText("Print books started by A");

        JButton getBookODD = new JButton();
        getBookODD.setText("Print odd id books");

        JTextArea resultLabel = new JTextArea(20, 28);

        JButton getBookType = new JButton();
        getBookType.setText("Print type books");


        //PanelResult
        JButton buttonDeleteResult = new JButton("Delete");
        buttonDeleteResult.setForeground(Color.black);

        JLabel resultTable = new JLabel();
        Object [][] rec = {
                { "1", "", "", "", "" },
                { "2", "", "", "", ""},
                { "3", "", "", "", ""},
                { "4", "", "", "", ""},
                { "5", "", "", "", ""},
                { "6", "", "", "", ""},
        };

        String[] header = { "Id", "Title", "Editor", "year", "boolean"};
        JTable taberesult = new JTable(rec, header);

        TableColumnModel columnModel = taberesult.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(70);
        columnModel.getColumn(2).setPreferredWidth(70);
        columnModel.getColumn(3).setPreferredWidth(70);
        columnModel.getColumn(4).setPreferredWidth(70);


        /***********************************************************/
        /**************** Add components in Panel ******************/
        /***********************************************************/

        paneStart.add(MainTitle);

        paneAddBook.add(labelTitle);
        paneAddBook.add(textTitle);
        paneAddBook.add(labelAuthor);
        paneAddBook.add(textAuthor);
        paneAddBook.add(labelYear);
        paneAddBook.add(textYear);
        paneAddBook.add(labelEditor);
        paneAddBook.add(textEditor);
        paneAddBook.add(labelLanguage);
        paneAddBook.add(textLanguage);
        paneAddBook.add(labelId);
        paneAddBook.add(textId);
        paneAddBook.add(labelButtonRadio);
        paneAddBook.add(buttonTypeManga);
        paneAddBook.add(buttonNovel);
        paneAddBook.add(buttonMagazine);
        paneAddBook.add(buttonValidate);
        paneAddBook.add(chooseTypeManga);
        paneAddBook.add(labelConfirm);
        paneAddBook.add(labelFailure);

        paneSearch.add(getAllBooks);
        paneSearch.add(getBooksStartByA);
        paneSearch.add(getBookODD);
        paneSearch.add(getBookType);
        paneSearch.add(resultLabel);

        paneResultTable.add(taberesult);
        paneResultTable.add(buttonDeleteResult);



        /***********************************************************/
        /********* Configuration of the application menu ***********/
        /***********************************************************/

        JMenuBar monMenu = new JMenuBar();
        this.setJMenuBar(monMenu);

        JMenu menuOptions = new JMenu("Options");
        monMenu.add(menuOptions);

        JMenuItem subMenuNew = new JMenuItem("Add book");
        JMenuItem subMenuSearch = new JMenuItem("Search in the library");
        JMenuItem subMenuResult = new JMenuItem("Result");
        JMenuItem subMenuExit = new JMenuItem("Exit");

        menuOptions.add(subMenuNew);
        menuOptions.add(subMenuSearch);
        menuOptions.add(subMenuResult);
        menuOptions.add(subMenuExit);


        /***********************************************************/
        /**************** User actions Menu management *************/
        /***********************************************************/

        subMenuNew.addActionListener(new ActionListener() {
                                         public void actionPerformed(ActionEvent e) {

                                             setContentPane(paneAddBook);
                                             setTitle("Add Book");

                                             labelConfirm.setVisible(false);
                                             labelFailure.setVisible(false);

                                             buttonValidate.addActionListener(new ActionListener() {
                                                 public void actionPerformed(ActionEvent e) {

                                                     if( buttonTypeManga.isSelected() || buttonNovel.isSelected() ||  buttonMagazine.isSelected()) {
                                                         String result = buttonGroup.getSelection().getActionCommand();
                                                         myLibrary.addBook(textTitle.getText(), textAuthor.getText(), Integer.parseInt(textYear.getText()), textEditor.getText(), textLanguage.getText(), Integer.parseInt(textId.getText()),result);
                                                     }
                                                     if (textTitle.getText().isEmpty() || textAuthor.getText().isEmpty() || textYear.getText().isEmpty() || textEditor.getText().isEmpty() || textId.getText().isEmpty()) {
                                                         labelConfirm.setVisible(false);
                                                         labelFailure.setVisible(true);
                                                         JOptionPane.showMessageDialog(null, "Uh-oh!", "Error", JOptionPane.ERROR_MESSAGE);
                                                     } else {
                                                         labelConfirm.setVisible(true);
                                                         labelFailure.setVisible(false);
                                                     }
                                                 }
                                             });


                                             buttonTypeManga.addActionListener(new ActionListener() {
                                                 public void actionPerformed(ActionEvent e) {
                                                     chooseTypeManga.setVisible(true);
                                                     String[] mangaType = {"Choose a type of Manga", "Shonen", "Hentaï", "Seinen"};

                                                     for (String s : mangaType) {
                                                         chooseTypeManga.addItem(s);
                                                     }
                                                 }
                                             });


                                         }
                                     }
        );


        subMenuSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setContentPane(paneSearch);
                setTitle("Search");

                getAllBooks.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        resultLabel.setEditable(false);
                        myLibrary.getAllBooks(resultLabel);
                    }
                });

                getBooksStartByA.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        myLibrary.getBookStartByA(resultLabel);

                    }
                });

                getBookODD.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        myLibrary.getBookIndexImpair(resultLabel);
                    }
                });

                getBookType.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        myLibrary.getBookByType(resultLabel);
                    }
                });

                revalidate();
            }
        });

        subMenuResult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setContentPane(paneResultTable);
                setTitle("Results table");
                getContentPane().add(taberesult.getTableHeader(), BorderLayout.NORTH);
                getContentPane().add(taberesult, BorderLayout.CENTER);
                revalidate();
            }
        });

        subMenuExit.addActionListener(new ActionListener() {
                                          public void actionPerformed(ActionEvent e) {
                                              System.exit(1);
                                          }
                                      }
        );


    }
}



