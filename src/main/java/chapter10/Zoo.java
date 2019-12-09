package chapter10;

import com.sun.org.apache.xml.internal.resolver.readers.SAXParserHandler;

public class Zoo {
    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal Sasha = new Dog();
        Sasha.makeSound();
        feed(Sasha);

        Sasha = new Cat();
        Sasha.makeSound();
        ((Cat) Sasha).scratch();
        feed(Sasha);
    }

    public static void feed(Animal animal) {

        if(animal instanceof Dog) {
            System.out.println("here's your dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("here's your cat food");
        }
    }
}
