package kz.enu.rest.UniversityManagement.controller;

import kz.enu.rest.UniversityManagement.model.Course;
import kz.enu.rest.UniversityManagement.model.Professor;
import kz.enu.rest.UniversityManagement.model.University;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/university")
public class UniversityController {

    private List<Course> courses = new ArrayList<>();
    private List<Professor> professors = new ArrayList<>();
    private List<University> universities = new ArrayList<>();

    // POST Mapping for Course
    @PostMapping("/course")
    public String addCourse(@RequestBody Course course) {
        courses.add(course);
        return "Course added successfully!";
    }

    // GET Mapping for Course
    @GetMapping("/course")
    public List<Course> getCourses() {
        return courses;
    }

    // POST Mapping for Professor
    @PostMapping("/professor")
    public String addProfessor(@RequestBody Professor professor) {
        professors.add(professor);
        return "Professor added successfully!";
    }

    // GET Mapping for Professor
    @GetMapping("/professor")
    public List<Professor> getProfessors() {
        return professors;
    }

    // POST Mapping for University
    @PostMapping("/university")
    public String addUniversity(@RequestBody University university) {
        universities.add(university);
        return "University added successfully!";
    }

    // GET Mapping for University
    @GetMapping("/university")
    public List<University> getUniversities() {
        return universities;
    }
}
