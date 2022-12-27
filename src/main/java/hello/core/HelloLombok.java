package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdf");

        String name = helloLombok.getName();
        System.out.println("name = " + name);

        //Lombok @ToString 어노테이션으로
        //helloLombok.toString() .toString() 생략가능
        System.out.println("helloLombok = " + helloLombok);
    }
}
