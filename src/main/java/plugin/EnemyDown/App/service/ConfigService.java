package plugin.EnemyDown.App.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.EnemyDown.App.mapper.GameConfigMapper;
import plugin.EnemyDown.App.mapper.data.GameConfig;
import plugin.EnemyDown.App.mapper.data.SpawnEnemy;

@Service
public class ConfigService {

  @Autowired
  private GameConfigMapper mapper;

  public List<GameConfig> searchConfigList() {
    return mapper.selectConfigList();
  }

  public GameConfig searchConfig(String difficulty) {

    return mapper.selectConfig(difficulty);
  }

  public List<SpawnEnemy> searchSpawnEnemyList(String difficulty) {
    return mapper.selectSpawnEnemy(difficulty);
  }
}
