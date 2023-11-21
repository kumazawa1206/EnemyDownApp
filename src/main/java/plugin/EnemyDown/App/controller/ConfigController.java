package plugin.EnemyDown.App.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import plugin.EnemyDown.App.mapper.data.GameConfig;
import plugin.EnemyDown.App.service.ConfigService;

@RestController
public class ConfigController {

  @Autowired
  private ConfigService service;

  @RequestMapping(value = "/configList", method = RequestMethod.GET)
  public List<GameConfig> configList() {
    return service.searchConfig();
  }
}
