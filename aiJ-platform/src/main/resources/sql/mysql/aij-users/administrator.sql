#sql("get_administrator_page")
SELECT s.*, r.status as role_status ,r.roles FROM user_profile s INNER JOIN user_role r ON (s.user_id = r.user_id) WHERE TRUE
#if(StrKit.notBlank(user_name))
    AND s.user_name LIKE concat('%', #p(user_name), '%')
#end
#if(status != null)
    AND s.status = #p(status)
#end
#end
