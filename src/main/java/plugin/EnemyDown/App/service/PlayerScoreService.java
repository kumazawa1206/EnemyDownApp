package plugin.EnemyDown.App.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.EnemyDown.App.mapper.PlayerScoreMapper;
import plugin.EnemyDown.App.mapper.data.PlayerScore;

@Service
public class PlayerScoreService {

  @Autowired
  private PlayerScoreMapper mapper;

  public List<PlayerScore> searchPlayerScoreList() {

    return mapper.selectPlayerScoreList();
  }
}
