package plugin.EnemyDown.App.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import plugin.EnemyDown.App.mapper.data.GameConfig;

@Mapper
public interface GameConfigMapper {

  @Select("select * from game_config")
  List<GameConfig> selectConfigList();

}
