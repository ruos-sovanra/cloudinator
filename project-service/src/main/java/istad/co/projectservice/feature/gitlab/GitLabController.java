package istad.co.projectservice.feature.gitlab;

import istad.co.projectservice.feature.gitlab.dto.CreateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/gitlab")
@RequiredArgsConstructor
public class GitLabController {

    private final GitLabService gitLabService;

    @PostMapping("/create-user")
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestParam String username, @RequestParam String password, @RequestParam String email) {
        gitLabService.createUser(username,password,email);
    }

}
