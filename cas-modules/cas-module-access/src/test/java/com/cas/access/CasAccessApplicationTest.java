package com.cas.access;

import com.cas.access.entity.AccessServerPort;
import com.cas.access.mapper.AccessServerPortMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
public class CasAccessApplicationTest {
    @Autowired
    private AccessServerPortMapper accessServerPortMapper;

    @Test
    public void test() {
        List<AccessServerPort> list = accessServerPortMapper.selectList(null);
        Assert.isTrue(1 == list.size());
        list.forEach(System.out::println);
    }
}
