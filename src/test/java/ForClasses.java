/**
 * Created by Vika on 22.01.17.
 */
public class ForClasses {
   private float a;
   private float b;
   private float c;
    private StaticNestedClass staticNestedClass;



    /**
     * @param a
     * @param b
     * @param c
     */
    private ForClasses (float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
        }

    private StaticNestedClass getSolution (){
        InnerClass innerClass = new InnerClass();
         if(innerClass.GetDiskriminant()>0){
              float x1 = (float) (((-b)-Math.sqrt(innerClass.GetDiskriminant()))/2*a);
              float x2 = (float) (((-b)+Math.sqrt(innerClass.GetDiskriminant()))/2*a);
              staticNestedClass = new ForClasses.StaticNestedClass(x1, x2);
                    return staticNestedClass;
        }
        else if (innerClass.GetDiskriminant()<0){
            System.out.println("No answer");
        }
        else {float x = (-b)*2*a;
            staticNestedClass = new StaticNestedClass(x);
                    return staticNestedClass;
        }
    return staticNestedClass;
    }



   private class InnerClass {
         private float GetDiskriminant(){
             return (b*b)-(4*a*c);
        }
    }

    static class StaticNestedClass{
         static float  x1;
         static float x2;
         static float x;

        StaticNestedClass(float x1, float x2){
            StaticNestedClass.x1 = x1;
            StaticNestedClass.x2 = x2;
        }

        private StaticNestedClass(float x) {
            StaticNestedClass.x = x;
        }

        private static void print(){
            System.out.println(StaticNestedClass.x1 + " x1");
            System.out.println(StaticNestedClass.x2 + " x2");
            System.out.println(StaticNestedClass.x + " x");
        }
    }

    public static void main(String[] args) {

        ForClasses ob = new ForClasses(1f, 3f, 1f);
        ob.getSolution();
        StaticNestedClass.print();
        InnerClass innerClass = ob.new InnerClass();
        System.out.println(innerClass.GetDiskriminant());

    }
}
