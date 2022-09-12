package ai.ecma.codingbat.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ai.ecma.codingbat.entity.template.AbsLongEntity;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cases",
        uniqueConstraints = @UniqueConstraint(
                columnNames = {"args", "problem_id"}))
public class Case extends AbsLongEntity {

    @Column(nullable = false, columnDefinition = "text")
    private String args;

    @Column(nullable = false, columnDefinition = "text")
    private String expected;

    @Column(nullable = false)
    private Boolean visible;

    @ManyToOne(optional = false)
    private Problem problem;

    @Column(nullable = false)
    private Double ordIndex;

    public Case(String args, String expected, Boolean visible, Problem problem) {
        this.args = args;
        this.expected = expected;
        this.visible = visible;
        this.problem = problem;
    }

    // 1, 2, 3, 4, 5, 6, 7
}