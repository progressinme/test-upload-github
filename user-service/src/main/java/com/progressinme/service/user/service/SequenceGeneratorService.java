package com.progressinme.service.user.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.progressinme.service.user.entity.DBSequence;

@Service
public class SequenceGeneratorService {
	@Autowired
	private MongoOperations mongoOperations;

	public Long getSequenceNumber(String sequenceName) {
		// get sequence number
		Query query = new Query(Criteria.where("id").is(sequenceName));

		// update the sequence number
		Update update = new Update().inc("seq", 1);

		// modify in document
		DBSequence counter = mongoOperations.findAndModify(query, update,
				FindAndModifyOptions.options().returnNew(true).upsert(true), DBSequence.class);

		return !Objects.isNull(counter) ? counter.getSeq() : 1;
	}
}
