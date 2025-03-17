package test.set;

/*
 *  vo (value object) == dto(data transfer object) == do(domain object) == entity == bean
 *  데이터 저장을 목적으로 하는 클래스를 가리키는 용어임
 *  작성규칙 :
 *  모든 필드는 반드시 private (캡슐화)
 *  매개 변수 없는 생성자(기본 생성자)와 매개변수 있는 생성자가 있어야 함
 *  모든 필드에 대한 getters and setters 반드시 있어야 함
 *  반드시 직렬화할 것
 *  toString() 오버라이딩
 */
public class User implements java.io.Serializable {

	private static final long serialVersionUID = 8754260285728510401L;

	private String userId;
	private String userPwd;
	private String userName;

	public User() {
		super();
	}

	public User(String userId, String userPwd, String userName) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + "]";
	}

}
