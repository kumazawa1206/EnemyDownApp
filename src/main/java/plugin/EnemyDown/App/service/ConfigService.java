package plugin.EnemyDown.App.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import plugin.EnemyDown.App.mapper.GameConfigMapper;
import plugin.EnemyDown.App.mapper.data.GameConfig;

@Service
public class ConfigService {

  @Autowired
  private GameConfigMapper mapper;

  public List<GameConfig> searchConfig() {

    return mapper.selectConfigList();
  }
}
