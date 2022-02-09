package gamepicker.net.springboot.games;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "gamename",nullable = false)
    private String name;

    @Column(name = "plattform")
    private Plattform platform;

    @Column(name = "genre",nullable = false)
    private Genre genre;

    @Column(name = "rating")
    private double rating;





}
