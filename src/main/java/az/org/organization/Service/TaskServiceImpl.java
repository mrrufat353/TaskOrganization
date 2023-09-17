package az.org.organization.Service;

import az.org.organization.Dto.TaskRequest;
import az.org.organization.Dto.TaskResponse;

import java.util.List;

public interface TaskServiceImpl {
    List<TaskResponse> findAll();

    void create2(TaskRequest taskRequest);

    TaskResponse getTaskId(Long id);

    void update2(Long id, TaskRequest taskRequest);

    void delete2(Long id);

}
