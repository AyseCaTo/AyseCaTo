package replit;

public class OOPValue {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Value{
    private int val;
    private boolean modified;

    public Value() {
    }

    public Value(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
        wasModified();
    }

    public boolean wasModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        setVal(val);
        this.modified = modified;
    }
}
/*
Write a class called Value with the following:
Instance variables :
  val as int
  modified as boolean

Constructors
a constructor with no parameters (empty)
a constructor accepting a single int parameter to initialize val

Methods :
a getter method for instance variable val - name it getVal
a getter method for instance variable modified - name it wasModified
a setter method for instance variable val - name it setVal
          it will set the value of the val to the new value passed.
          calling setVal method means original value of instance variable val has been modified,
          so set the value of instance variable 'modified' to appropriate value to indicate data has been modified after calling the setVal.
 */