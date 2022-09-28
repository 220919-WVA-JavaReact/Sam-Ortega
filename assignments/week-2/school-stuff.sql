CREATE TABLE students(
id serial PRIMARY KEY,
"name" varchar(255),
"phoneNumber" varchar(255),
email varchar(255)
);

CREATE TABLE courses(
id serial PRIMARY KEY,
"title" varchar(255),
courseNumber int UNIQUE
);

CREATE TABLE students_courses(
student_id int REFERENCES students,
course_id int REFERENCES courses
);

CREATE TABLE teachers(
id serial PRIMARY KEY,
"name" varchar(255),
phoneNumber varchar(255),
email varchar(255),
courseNum int REFERENCES courses (courseNumber)

);

CREATE TABLE topics(
id serial PRIMARY KEY,
topic varchar(255)
);

CREATE TABLE courses_topics(
course_id int REFERENCES courses,
topic_id int REFERENCES topics
);

INSERT INTO topics (topic)
VALUES
('adding'),
('protons'),
('painting');

INSERT INTO students ("name", "phoneNumber", email)
VALUES 
('Sam Ortega', '8675309', 'email@example.com'),
('Rob Henry', '4542216', 'email2@example.com'),
('Janet Reynoso', '5682354', 'email3@example.com'),
('Ren Omaha', '7963589', 'email4@example.com');


INSERT INTO courses ("title", courseNumber)
VALUES 
('Math', 5),
('Science', 3),
('Art', 6);

INSERT INTO students_courses 
VALUES
(1,1),
(1,3),
(1,2),
(3,3),
(2,3),
(4,1);

INSERT INTO teachers ("name", phoneNumber, email, courseNum)
VALUES 
('Mr. Thomas', 5556321, 'email7@example.com', 5),
('Ms. Vilamear', 8956452, 'email5@example.com', 6),
('Mr. Montegue', 5326842, 'nope@email.com', 3);



INSERT INTO courses_topics 
VALUES
(1,1),
(2,2),
(3,3);

INSERT INTO courses("title", courseNumber)
VALUES 
('Reading', 4),
('Writing', 2);

INSERT INTO topics (topic)
VALUES
('essays'),
('Harry Potter');

INSERT INTO courses_topics 
VALUES
(4,5),
(5,4);
