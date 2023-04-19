var template = "<tr>" +
    "<td>[jnum]</td>" +
    "<td>[deptName]</td>" +
    "<td>[name]</td>" +
    "<td>[nation]</td>" +
    "<td>[card]</td>" +
    "<td>[education]</td>" +
    "<td>[age]</td>" +
    "<td>[phone]</td>" +
    "<td>[email]</td>" +
    "<td>[gender]</td>" +
    "</tr>"

var userList = "/users/list"

$(function (){
    listUser();
})

//查询用户地址信息
function listUser() {
    $.get(userList, function (result) {
        if (result.state == 1000) {
            for (var index in result.data) {
                console.log(result.data)
                var addr = result.data[index]
                var td = template.replace("[jnum]", addr.jnum)
                    .replace("[deptName]", addr.deptName)
                    .replace("[name]", addr.name)
                    .replace("[nation]", addr.nation)
                    .replace("[card]", addr.card)
                    .replace("[education]", addr.education)
                    .replace("[age]", addr.age)
                    .replace("[phone]", addr.phone)
                    .replace("[email]", addr.email)
                    .replace("[gender]", addr.gender)
                // .replace(/\[aid\]/g, addr.id)
                var tobj = $(td)
                var btnDefault = tobj.find(".btn-default")
                if (addr.isDefault == 1) {
                    btnDefault.remove()
                }
                $("#tbody").append(tobj)
            }
        } else {
            alert(result.msg)
        }
        //为删除按钮添加点击事件
        $(".btn-delete").bind("click", function () {
            var flag = confirm("确定要删除此地址吗?")
            if (flag == false) {
                return
            }
//    获取地址id
            var id = $(this).attr("aid");
            params = {
                id: id,
            }
        })

    })
}