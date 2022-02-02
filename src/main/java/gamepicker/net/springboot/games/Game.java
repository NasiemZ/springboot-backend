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

    @Column(name = "platform")
    private String platform;

    @Column(name = "gerne",nullable = false)
    private Genre gerne;

    @Column(name = "rating")
    private double rating;





}
