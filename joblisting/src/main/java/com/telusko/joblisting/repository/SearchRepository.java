package com.telusko.joblisting.repository;

import java.util.List;
import com.telusko.joblisting.model.Post;
public interface SearchRepository {

	List<Post> findByText(String text);
}
