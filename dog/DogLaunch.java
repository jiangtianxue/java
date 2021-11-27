package dog;

public class DogLaunch {
    public static void main(String[] args) {
        Dog smallDog;
        new Dog(20);
        smallDog = new Dog(5);
        Dog hugeDog = new Dog(150);
        smallDog.makeNoise();
        hugeDog.makeNoise();

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);
        dogs[0].makeNoise();
        dogs[1].makeNoise();

        System.out.println();
        Dog smallDog2 = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog2 = new Dog(150);

        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog2;
        manyDogs[1] = hugeDog2;
        manyDogs[2] = new Dog(130);
        manyDogs[3] = new Dog(28);

        int i = 0;
        while (i < manyDogs.length){
            Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
            i = i + 1; 
        }

    }
}
