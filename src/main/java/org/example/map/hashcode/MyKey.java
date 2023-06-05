package org.example.map.hashcode;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class MyKey {

    @Override
    public int hashCode() {
        System.out.println("hashCode() 메소드 호출");
        return super.hashCode();
    }
}
