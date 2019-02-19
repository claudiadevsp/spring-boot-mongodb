package com.css.mongo.domain.resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.css.mongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User mary = new User("1", "mary", "teste@gmail.com");
		User alex = new User("2", "alex", "teste2@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(mary, alex));
		return ResponseEntity.ok().body(list);
	}

}
