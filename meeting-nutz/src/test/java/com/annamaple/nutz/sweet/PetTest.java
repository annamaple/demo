package com.annamaple.nutz.sweet;

import org.junit.jupiter.api.Test;
import org.nutz.lang.Mirror;


/**
 * @author xionglei
 * @create 2022-05-07 16:35
 */
class PetTest {

    @Test
    public void test() {
        Mirror<Pet> mirror = Mirror.me(Pet.class);
        Pet pet = mirror.born("xiao", "2008-10-12 12:23:24");
        System.out.println(pet);
    }
    
    @Test
    public void testCopy() {
        AnimalArgs animalArgs = new AnimalArgs("ani", 12);
        
    }
}