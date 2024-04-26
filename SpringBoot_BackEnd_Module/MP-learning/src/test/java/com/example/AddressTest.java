package com.example;

import com.example.mapper.AddressMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Description：TODO
 * @Author： RainbowJier
 * @Data： 2024/4/24 17:04
 */

@SpringBootTest
public class AddressTest {
    @Autowired
    private AddressMapper addressMapper;


    @Test
    void testDelete() {
//        addressService.removeById(59L);
        addressMapper.deleteById(59L);

    }
}



















