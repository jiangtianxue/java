package dog;

public class Dog {
    /*  这是实例变量 */
    public int weightInPounds;
    
    /*  类的构造函数 */
    public Dog(int startWeight){
        weightInPounds = startWeight;
    }

    /*  使用了static关键字声明的是static method */
    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds){
            return d1;
        }
        return d2;
    }

    /*  没有使用static关键字声明的是non-static method */
    public void makeNoise(){
        if (weightInPounds < 10){
            System.out.println("bark!");
        }
        else if (weightInPounds < 30){
            System.out.println("yipyip!");
        }    
        else {
            System.out.println("woof!");
        }
        
    }
}