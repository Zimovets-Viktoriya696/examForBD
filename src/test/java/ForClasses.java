/**
 * Created by Vika on 22.01.17.
 */
public class ForClasses {
    float a;
    float b;
    float c;
    InnerClass innerClass;
    StaticNestedClass staticNestedClass;

    ForClasses (float a, float b, float c){
        this.a = a;
        this.b = b;
        this.c = c;
        }

    public StaticNestedClass getSolution (){
         innerClass = new InnerClass();
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



    class InnerClass {
         public float GetDiskriminant(){
             return (b*b)-(4*a*c);
        }
    }

    static class StaticNestedClass{
         static float  x1;
         static float x2;
         static float x;

        StaticNestedClass(float x1, float x2){
            this.x1 = x1;
            this.x2 = x2;
        }

        public StaticNestedClass(float x) {
            this.x = x;
        }

        public static void print(){
            System.out.println(StaticNestedClass.x1 + " x1");
            System.out.println(StaticNestedClass.x2 + " x2");
            System.out.println(StaticNestedClass.x + " x");
        }
    }

    public static void main(String[] args) {

        ForClasses ob = new ForClasses(1f, 3f, 1f);
        StaticNestedClass st = ob.getSolution();
        st.print();
        InnerClass innerClass = ob.new InnerClass();
        System.out.println(innerClass.GetDiskriminant());

    }
}
