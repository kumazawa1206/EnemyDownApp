package plugin.EnemyDown.App.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.EnemyDown.App.DuplicateConfigException;
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
    return mapper.selectSpawnEnemyList(difficulty);
  }

  //登録処理//
  //例外処理//
  public GameConfig registerConfig(GameConfig config) throws Exception {
    if (searchConfig(config.getDifficulty()) != null) {
      throw new DuplicateConfigException("Duplicate Config Error!!");
    }
    mapper.insertConfig(config);
    return mapper.selectConfig(config.getDifficulty());
  }

  //更新処理//
  public List<SpawnEnemy> updateEnemyScore(SpawnEnemy enemy) {
    mapper.updateEnemyScore(enemy);
    return mapper.selectSpawnEnemyList(enemy.getDifficulty());
  }
}
