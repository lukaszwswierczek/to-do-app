package pl.lukasz.todoapp.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //RestResource //zasoby repozytorium tworzone przez springa
//(path = "todos", collectionResourceRel = "todos")
//w ten sposob dochodzi do zmiany nazwy zasobu i adresu url
public interface SqlTaskRepository extends TaskRepository, JpaRepository <Task, Long> {

//    @Override
//    @RestResource(exported = false)
    //nie bedzie mozna usuwac nowo dodanych taskow poprzez zadanie DELETE
    //dzieki adnotacji metoda nie bedzie dostepna na zewnatrz
    //trzeba wybrac obie metody delete z listy override methods
//    void deleteById(Long aLong);
//
//    @Override
//    @RestResource(exported = false)
//    void delete(Task task);

    //DSL -> domain specific language
    //czyli sugestie wg pol encji przy tworzeniu metody
    //metoda bedzie dostepna pod url poniewaz jest metoda RestResource
    //tasks/search/done
//    @RestResource(path = "done", rel = "done")
//    List<Task> findByDoneIsTrue();
//
//    //tasks/search/isDone
//    @RestResource(path = "isDone", rel = "isDone")
//    List<Task> findByDone(@Param("state") boolean done); -- przeniesione do TaskRepository
}
