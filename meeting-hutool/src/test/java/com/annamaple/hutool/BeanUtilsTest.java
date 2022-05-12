package com.annamaple.hutool;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Console;
import com.annamaple.hutool.dto.AnimalDto;
import com.annamaple.hutool.model.AnimalModel;
import com.annamaple.hutool.model.SystemModel;
import org.junit.jupiter.api.Test;


/**
 * @author xionglei
 * @create 2022-05-07 17:14
 */
public class BeanUtilsTest {
    

    @Test
    public void test() {

        AnimalDto animalDto = new AnimalDto("hua", 12, false);
        AnimalModel animalModel = new AnimalModel();
        BeanUtil.copyProperties(animalDto, animalModel);
        Console.log("animalDto: {}", animalDto);
        animalModel.setSystemModel(SystemModel.newInstance());
        Console.log("animalModel: {}", animalModel);
    }
}
