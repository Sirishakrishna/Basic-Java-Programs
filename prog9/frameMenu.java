import java.awt.*;
public class frameMenu extends Frame{
 public boolean handleevent(Event e){
        if(e.id==Event.WINDOW_DESTROY)
          {
           System.exit(0);
          }
      return super.handleEvent(e);
    }

        public static void main(String arg[])
           {
            Frame frame;
            frame=new Frame("my frame");
            frame.setSize(300,400);
            frame.setBackground(Color.green);
            Panel pn1=new Panel();
            //Textfield
            TextField t1=new TextField("hello");
             //Textarea
            TextArea ta=new TextArea(5,6);
              //labels
             Label l1=new Label("Enter ?",Label.CENTER);
             Label l2=new Label("enter details");
             //choices
              Choice c=new Choice();
              c.addItem("choice1");
              c.addItem("choice2");
             //list
              List lst=new List(5,true);
              lst.add("Tea");
              lst.add("Coffee");
              lst.add("Boost");
                //checkbox
             CheckboxGroup grp=new CheckboxGroup();
              Checkbox chk=new Checkbox("Library",grp,true);
              Checkbox chk1=new Checkbox("Hostel",grp,false);
               //Menu bar
               MenuBar mb=new MenuBar();
               Menu File=new Menu("File");
               MenuItem it1=new MenuItem("New");
               MenuItem ar1=new MenuItem("Arial");
               MenuItem tnr=new MenuItem("Times New Roman");
                //check box
               Menu Font=new Menu("Font");
               Font.add(ar1);
               Font.add(tnr);
               Font.add(it1);
               mb.add(File);
               File.add(Font);
               Button b1=new Button("CLICK");
               frame.add(pn1);
               frame.setMenuBar(mb);
               pn1.add(l1);
               pn1.add(t1);
               pn1.add(l2);
               pn1.add(ta);
               pn1.add(c);
               pn1.add(lst);
               pn1.add(chk);
               pn1.add(chk1);
               pn1.add(b1);
               frame.setVisible(true);
               }
             }
             
