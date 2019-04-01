ALTER TABLE ay_user
	ADD content VARCHAR(50) DEFAULT '' COMMENT 'content',
	ADD INDEX (content);
