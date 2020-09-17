package de.aw.blog.comments;

import java.util.Iterator;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends PagingAndSortingRepository<Comment, Long>{

	
	

}
