package com.example;

import com.example.mapper.AddressMapper;
import com.example.service.IAddressService;
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

    @Autowired
    private IAddressService addressService;

    @Test
    void testDelete() {
//        addressService.removeById(59L);
        addressMapper.deleteById(59L);
    }
}
