@GoodDoctor
Feature: Registration

  #case ini butuh login terlebih dahulu dan set no Reset is true, karena keterbatasan get OTP
  @Scenario001
  Scenario: User complete the medicine purchase on Toko Kesehatan
    Given user click Nav Bar "home"
    And user set Address "Pt Good Doctor Technology Indonesia"
    When user click Nav Bar "store"
    And user input product "Promag Sach 7 Ml/ Dos" on search box
    And user select the first item
#    switch context ke webview tapi element under data-reactroot tidak bisa ketemu element nya
#    And user set item qty 2
#    And user click Add to Cart

  @Scenario4
  Scenario: Button Lanjutkan is disabled when TNC box still unchecked
    Given user is on inputed phone number page
    When user input phone number "8678676786876876"
    And user uncheck T&C box button
    Then user verify button Lanjutkan is disable

  @scenario5
  Scenario: Input invalid OTP when registration
    Given user is on inputed phone number page
    When user input phone number "8678676786876876"
    And user check TNC box
    And user click Lanjutkan button
    And user input invalid OTP number
    Then user click Verifikasi button
    And user verify got error mesage "Kode verifikasi keliru. Mohon cek ulang dan coba lagi."