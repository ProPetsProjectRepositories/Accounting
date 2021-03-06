package propets.service.accouting;

import java.util.HashMap;
import java.util.Set;

import org.springframework.http.ResponseEntity;

import propets.dto.accouting.UserBlockDto;
import propets.dto.accouting.UserEditDto;
import propets.dto.accouting.UserProfileDto;
import propets.dto.accouting.UserRegRespDto;
import propets.dto.accouting.UserRegisterDto;

public interface UserAccountService {

	ResponseEntity<UserRegRespDto> userRegistration(UserRegisterDto user);

	ResponseEntity<UserProfileDto> login(String login);

	UserProfileDto editUser(String login, UserEditDto userEditDto);

	UserProfileDto removeUser(String login);

	UserBlockDto blockAccount(String login, boolean status);

	Set<String> addRole(String login, String role);

	Set<String> removeRole(String login, String role);

	UserProfileDto findUserByID(String login);

	ResponseEntity<String> checkXToken(String xToken);

	boolean addFavorite(String nameService, String postId, String login);

	boolean removeFavorite(String nameService, String postId, String login);

	HashMap<String, Set<String>> getFavorites(String login);

	boolean addActivities(String nameService, String postId, String login);

	boolean removeActivities(String nameService, String postId, String login);

	HashMap<String, Set<String>> getActivities(String login);

}
