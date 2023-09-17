package az.org.organization.Controller;

import az.org.organization.Dto.TaskRequest;
import az.org.organization.Dto.TaskResponse;
import az.org.organization.Service.TaskServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v3/api")
@RequiredArgsConstructor
public class TaskController {

    private final TaskServiceImpl taskServiceImpl;

    @GetMapping("/read3")
    public List<TaskResponse> findAll() {
        return taskServiceImpl.findAll();
    }

    @PostMapping("/create3")
    public void create2(@RequestBody TaskRequest taskRequest) {
        taskServiceImpl.create2(taskRequest);

    }

    @GetMapping("/{id}")
    public TaskResponse getTaskId(@PathVariable Long id) {
        return taskServiceImpl.getTaskId(id);
    }

    @PutMapping("/{id}")
    public void update2(@PathVariable Long id, @RequestBody TaskRequest taskRequest) {
        taskServiceImpl.update2(id, taskRequest);
    }

    @DeleteMapping("/{id}")
    public void delete2(@PathVariable Long id) {
        taskServiceImpl.delete2(id);

    }
}
