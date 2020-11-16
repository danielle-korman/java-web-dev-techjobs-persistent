package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {


@ManyToOne
//@NotNull(message = "Employer Required")
    private Employer employer;

    @ManyToMany
    private List<Skill> skills  = new ArrayList<>();

    public Job() {}

    public Job(Employer employer, List<Skill> someSkills) {
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }
    public Employer getEmployer() {
        return employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
