package com.shiningheart.organization.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author kuangzhenyu
 * @version 1.0
 * @description TODO
 * @date 2019/8/28 11:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrganizationRepositoryTest {
    @Resource
    private OrganizationRepository orgRepository;

    @Test
    public void findById() {
        System.out.println(orgRepository.findById("442adb6e-fa58-47f3-9ca2-ed1fecdfe86c"));

    }

    @Test
    public void save() {
    }

    @Test
    public void delete() {
    }
}