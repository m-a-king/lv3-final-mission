package finalmission.player.infrastructure;

import finalmission.player.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    Optional<Player> findByNickname(String nickname);

    boolean existsByNickname(String nickname);
}
