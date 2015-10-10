class HomeController < ApplicationController
  def index
    # int num1, num2, num3, @combNum
    numCorrect=0
    # double ans, @input_answer=0
    ans = 0
    @input_answer = 0
    # Scanner scanner = new Scanner(System.in)
    1.up_to(20) do
      #Generate numbers and answers
      num1=(rand()*9)+1
      num2=(rand()*9)+1
      num3=(rand()*9)+1
      @combNum=(rand()*16)+1
      case @combNum
        when 1
          ans = num1 + num2 + num3
        when 2
          ans = num1 + num2 - num3
        when 3 
          ans = num1 + num2 * num3
        when 4
          ans = num1 + (num2 / num3)
        when 5
          ans = num1 - num2 + num3
        when 6
          ans = num1 - num2 - num3
        when 7
          ans = num1 - num2 * num3
        when 8
          ans = num1 - (num2 / num3)
        when 9 
          ans = num1 * num2 + num3
        when 10
          ans = num1 * num2 - num3
        when 11
          ans = num1 * num2 * num3
        when 12
          ans = num1 * (num2 / num3)
        when 13
          ans = (num1 / num2) + num3
        when 14
          ans = (num1 / num2) - num3
        when 15
          ans = (num1 / num2) * num3
        else
          ans = (num1 / num2) / num3
      end
     
      # #Scan in string, inputs character 1 and 2 as operators
      # scanner = new Scanner(System.in)
      # String strInput = scanner.next()
      # char input1 = strInput.charAt(0)
      # char input2 = strInput.charAt(1)
      input1='+'
      input2='-'
      #Calculate number value the user's operators result in
      if input1 == '+' && input2 == '+'
          @input_answer = num1 + num2 + num3
      elsif input1 == '+' && input2 == '-'
          @input_answer = num1 + num2 - num3
      elsif input1 == '+' && input2 == '*'
          @input_answer = num1 + num2 * num3
      elseif input1 == '+' && input2 == '/'
          @input_answer = num1 + (num2 / num3)
      elsif input1 == '-' && input2 == '+'
          @input_answer = num1 - num2 + num3
      elsif input1 == '-' && input2 == '-'
          @input_answer = num1 - num2 - num3
      elsif input1 == '-' && input2 == '*'
          @input_answer = num1 - num2 * num3
      elsif input1 == '-' && input2 == '/'
          @input_answer = num1 - (num2 / num3)
      elsif input1 == '*' && input2 == '+'
          @input_answer = num1 * num2 + num3
      elsif input1 == '*' && input2 == '-'
          @input_answer = num1 * num2 - num3
      elsif input1 == '*' && input2 == '*'
          @input_answer = num1 * num2 * num3
      elsif input1 == '*' && input2 == '/'
          @input_answer = num1 * (num2 / num3)
      elsif input1 == '/' && input2 == '+'
          @input_answer = (num1 / num2) + num3
      elsif input1 == '/' && input2 == '-'
          @input_answer = (num1 / num2) - num3
      elsif input1 == '/' && input2 == '*'
          @input_answer = (num1 / num2) * num3
      elsif input1 == '/' && input2 == '/'
          @input_answer =(num1 / num2) / num3
      else
        @out = "Input is not valid."
      end
        
      #Verify if user's operators are correct
      if @input_answer == ans
          @out = "You're right!"
          numCorrect += 1
      else
          @out = "HA!"
      end
    end
  end
  def new
    @welcome = Welcome.new
  end

  # GET /welcomes/1/edit
  def edit
  end

  # POST /welcomes
  # POST /welcomes.json
  def create
    @welcome = Welcome.new(welcome_params)

    respond_to do |format|
      if @welcome.save
        format.html { redirect_to @welcome, notice: 'Welcome was successfully created.' }
        format.json { render :show, status: :created, location: @welcome }
      else
        format.html { render :new }
        format.json { render json: @welcome.errors, status: :unprocessable_entity }
      end
    end
  end
end