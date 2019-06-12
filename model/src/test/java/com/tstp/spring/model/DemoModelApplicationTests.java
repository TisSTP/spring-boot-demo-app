package com.tstp.spring.model;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tstp.spring.model.domain.entity.User;
import com.tstp.spring.model.domain.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoModelApplicationTests {

  @Autowired
  private UserRepository userRepository;

  @Before
  public void setUp() throws Exception {
    userRepository.save(new User(Integer.valueOf(1), "Dummy Name", "Dummy Email"));
  }

  @Test
  public void find_user_by_id_1() {
    Optional<User> userOptional = userRepository.findById(1);
    User user = userOptional.get();
    assertEquals(Integer.valueOf(1), user.getId());
    assertEquals("Dummy Name", user.getName());
    assertEquals("Dummy Email", user.getEmail());
  }

}
