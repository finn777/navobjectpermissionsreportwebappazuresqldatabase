package navobjectpermissionsreportwebappazuresqldatabase.models;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface DataCrud extends CrudRepository<Data, Long> {

} // class DataCrud
