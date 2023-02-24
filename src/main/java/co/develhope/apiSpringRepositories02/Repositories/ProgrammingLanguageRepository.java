package co.develhope.apiSpringRepositories02.Repositories;

import co.develhope.apiSpringRepositories02.Entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("This is the path"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
