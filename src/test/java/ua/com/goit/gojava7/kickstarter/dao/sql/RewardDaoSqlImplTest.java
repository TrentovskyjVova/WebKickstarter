package ua.com.goit.gojava7.kickstarter.dao.sql;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.contains;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import ua.com.goit.gojava7.kickstarter.dao.RewardDao;
import ua.com.goit.gojava7.kickstarter.dao.sql.RewardDaoSqlImpl;
import ua.com.goit.gojava7.kickstarter.domain.Reward;

@RunWith(MockitoJUnitRunner.class)
public class RewardDaoSqlImplTest {
	@Mock
	private JdbcTemplate jdbcTemplate;
	@InjectMocks
	private RewardDao rewardDaoMySqlImpl = new RewardDaoSqlImpl();

	@Test
	@Ignore
	public void testGetRewards() {

		rewardDaoMySqlImpl.getRewards(1L);
		verify(jdbcTemplate).query(contains("reward WHERE projectId = ?"), any(Integer[].class),
				any(BeanPropertyRowMapper.class));
	}

	@Test
	@Ignore
	public void testGetRewardById() {

		rewardDaoMySqlImpl.getReward(12L);
		verify(jdbcTemplate).queryForObject(contains("reward WHERE id = ?"), any(Integer[].class),
				any(BeanPropertyRowMapper.class));
	}

}
