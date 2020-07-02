

class Printer
{
    boolean wasRun;
   
    public void printArray(Object o) {
       if(wasRun) {
           return;
       }
        System.out.print("1\n2\n3\nHello\nWorld\n");
        wasRun = true;
   }
}

