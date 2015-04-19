$(function() {
    $("#history-table button").on("click", function() {
        var transaction_id = $(this).attr("data-id");
        $.ajax({
            type: "GET",
            url: "/eBusiness/rest/transaction/records/" + transaction_id,
            dataType: "json",
            contentType: "application/json",
            success: function(records) {
                $.each(records,function(index,record){
					console.log(record);
					$("#recordDisplay").append("<tr><td>" + record.product_id + "</td>\n\
                                <td>" + record.product.product_name + "</td>\n\
                                <td>" + record.amount + "</td>\n\
                                <td>" + record.price + "</td></tr>")
                });
            },
            error: function() {
                console.log("111");
            }
        });
    });
});